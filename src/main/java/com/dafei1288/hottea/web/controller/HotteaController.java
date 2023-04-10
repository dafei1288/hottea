package com.dafei1288.hottea.web.controller;

import com.dafei1288.hottea.Hottea;
import com.google.gson.Gson;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/hottea")
public class HotteaController {

    public static String configFile = "D:\\working\\others\\procjetAlice\\testgpt\\src\\main\\resources\\hottea.yml";

    @GetMapping(value = "/dashboard")
    public String getDashboard(@Param("sentence") String sentence) throws Exception{
        Gson gson = new Gson();
        Map<String,Object> res = new HashMap<>();

        Hottea hottea = new Hottea(sentence,configFile);
        hottea = hottea.doExec();

        res.put("hhtml",hottea.printHtmlResultSet());
        res.put("tree",hottea.getSyntaxTree());
        res.put("sql",hottea.getSql());
        res.put("ast",hottea.getAstNode());

        return gson.toJson(res);
    }


    @GetMapping(value ="/html")
    public String getHtmlData(@Param("sentence") String sentence) throws Exception {
        String configFile = "D:\\working\\others\\procjetAlice\\testgpt\\src\\main\\resources\\hottea.yml";
        Hottea hottea = new Hottea(sentence,configFile);
        hottea = hottea.doExec();

//        hottea.printResultSet();
        return hottea.printHtmlResultSet();
    }

    @GetMapping(value ="/tree")
    public String getHtmlTree(@Param("sentence") String sentence) throws Exception {
        String configFile = "D:\\working\\others\\procjetAlice\\testgpt\\src\\main\\resources\\hottea.yml";
        Hottea hottea = new Hottea(sentence,configFile);
        hottea = hottea.doExec();

//        hottea.printResultSet();
        return hottea.getSyntaxTree();
    }


    @GetMapping(value ="/ast")
    public String getAst(@Param("sentence") String sentence) throws Exception {
        String configFile = "D:\\working\\others\\procjetAlice\\testgpt\\src\\main\\resources\\hottea.yml";
        Hottea hottea = new Hottea(sentence,configFile);
        hottea = hottea.doExec();

//        hottea.printResultSet();
        return hottea.getAstNode();
    }
}
