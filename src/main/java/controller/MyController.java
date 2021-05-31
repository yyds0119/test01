package controller;

import dao.PetDao;
import entity.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MyService;
import service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {
    @Resource
    private MyService service;
    @RequestMapping("/getAll")
    public ModelAndView getAll(){
        ModelAndView mv = new ModelAndView();
        List<Pet> list = service.selectAll();
        mv.addObject("list",list);
        System.out.println("1111111");
        mv.setViewName("petInfo");
        return mv;
    }
}
