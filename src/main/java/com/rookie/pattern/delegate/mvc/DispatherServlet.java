package com.rookie.pattern.delegate.mvc;

import com.rookie.pattern.delegate.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eric
 * @Date: 2019/3/17 22:50
 * @Version 1.0
 */
public class DispatherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> mbzz = MemberController.class;
            handlerMapping.add(new Handler().setController(mbzz.newInstance())
                    .setMethod(mbzz.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * springmvc的实现大致思路
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        //1.获取用户请求的url
        String uri = req.getRequestURI();
        //2.servlet拿到url后会根据用户请求URL去找这个url对应的某一个java类的方法
        //3.通过拿到的URL去handlerMapping
        Handler handle = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handle = h;
                break;
            }
        }

        //4.将具体的任务分发给Method(通过反射去调用)
        Object object = null;
        try {
            object = handle.getMethod().invoke(handle.getController(), req.getParameter("mid"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //5.获取到method执行结果,通过response返回
        //resp.getWriter().write();
    }


    class Handler {

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

}
