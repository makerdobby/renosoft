package kr.renosoft.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class TitleInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response
        , Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response
        , Object handler, ModelAndView modelAndView) throws Exception {

        String title = "RENOSOFT 레노소프트";
        String uri = request.getRequestURI();

        /* TODO 데이터화가 되면 그때 따로 처리하자 */
        switch(uri) {
            case "/":
                break;

            case "/work/dream":
                title = "꿈이음 - ".concat(title);
                break;

            case "/work/eschool":
                title = "학생선수 - ".concat(title);
                break;

            case "/work/hcc":
                title = "라쿠카라차 - ".concat(title);
                break;

            case "/work/hub":
                title = "탈북청소년 - ".concat(title);
                break;

            case "/work/hyundai":
                title = "현대자동차 - ".concat(title);
                break;

            case "/work/ican":
                title = "교원 - ".concat(title);
                break;

            case "/work/lottecard":
                title = "롯데카드 - ".concat(title);
                break;

            case "/work/ondot":
                title = "교실온닷 - ".concat(title);
                break;

            case "/work/online":
                title = "온라인 보충과정 - ".concat(title);
                break;

            case "/work/pay":
                title = "삼성페이 - ".concat(title);
                break;

            case "/work/s4u":
                title = "스쿨포유 - ".concat(title);
                break;

            default:
                break;

        }

        if(modelAndView != null && !"".equals(title)) {
            modelAndView.addObject("title", title);
        }

    }

}
