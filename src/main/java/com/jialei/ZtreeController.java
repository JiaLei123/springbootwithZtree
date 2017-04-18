package com.jialei;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cdjialei on 2017/4/18.
 */
@Controller
public class ZtreeController {

    @RequestMapping(value = "ShowTreeData", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody Object ShowTreeData(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        JSONArray resultJsonArray = new JSONArray();
        JSONObject father1 = new JSONObject();

        father1.put("name", "father1");
        father1.put("type", "father");
        father1.put("deviceID", 123);
        JSONArray childList1 = new JSONArray();
        JSONObject child1 = new JSONObject();
        child1.put("name", "child1");
        child1.put("type", "child");
        child1.put("deviceID", 123);
        JSONObject child2 = new JSONObject();
        child2.put("name", "child2");
        child2.put("type", "child");
        child2.put("deviceID", 123);
        childList1.add(child1);
        childList1.add(child2);
        father1.put("children", childList1);

        JSONObject father2 = new JSONObject();
        father2.put("name", "father2");
        father2.put("type", "father");
        father2.put("deviceID", 456);
        JSONArray childList2 = new JSONArray();
        JSONObject child3 = new JSONObject();
        child3.put("name", "child3");
        child3.put("type", "child");
        child3.put("deviceID", 456);
        JSONObject child4 = new JSONObject();
        child4.put("name", "child4");
        child4.put("type", "child");
        child4.put("deviceID", 1456);
        childList2.add(child3);
        childList2.add(child4);
        father2.put("children", childList2);

        resultJsonArray.add(father1);
        resultJsonArray.add(father2);
        return resultJsonArray;
    }
}
