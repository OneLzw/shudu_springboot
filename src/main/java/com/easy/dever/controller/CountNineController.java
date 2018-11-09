package com.easy.dever.controller;

import com.easy.dever.service.CountNineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/count/nine")
public class CountNineController {

    @Autowired
    CountNineService countNineService;

    @RequestMapping(value = "gotonine")
    public String goToNinePage() {
        return "nine/ninePage";
    }

    @RequestMapping(value="countshu", method = RequestMethod.POST , produces = "application/json;")
    public String countshu (@RequestParam("longnumber")String longnumber) throws Exception {
        int[][] numberArray = countNineService.getIntArray(longnumber);
        //重复性检测，看同一个九宫格内是否有相同的数字
        boolean nultiCheck = countNineService.getRightShu(numberArray);
        if (!nultiCheck) {
            return "hisroty";
        }
        // 和检测，看九宫格内横与竖之和是否为15
        boolean perfectCheck = countNineService.getPerfectShu(numberArray);
        if (perfectCheck) {
            countNineService.writeToTxt(numberArray , "" , true);
        } else {
            countNineService.writeToTxt(numberArray , "" , false);
        }
        countNineService.getFinishShu(numberArray);
        return "countNine/history";
    }

}
