package com.ebookmysql.controller;

import com.ebookmysql.domain.EbookSql;
import com.ebookmysql.service.EbookSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EbookSqlController {

    @Autowired
    EbookSqlService ebookSqlService;

    @GetMapping("/mT3ch-ebook-mysql")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-ebook-mysql")
    public String cadastrarEbook(EbookSql ebookSql) {
        ebookSqlService.criarLead(ebookSql);
        return "pages/ebook";
    }


    @GetMapping("/mT3ch-receber-ebook-mysql")
    public ModelAndView receberEbook() {
        ModelAndView model = new ModelAndView("pages/ebook");
        Iterable<EbookSql> ebook = ebookSqlService.exibirPageEbook();
        model.addObject("ebook", ebook);
        return model;
    }
}
