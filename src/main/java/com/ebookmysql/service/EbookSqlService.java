package com.ebookmysql.service;

import com.ebookmysql.domain.EbookSql;
import com.ebookmysql.repository.EbookSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookSqlService {

    @Autowired
    EbookSqlRepository ebokEbookJavaRepository;

    public void criarLead(EbookSql ebookSql){
        ebokEbookJavaRepository.save(ebookSql);
    }

    public Iterable<EbookSql> exibirPageEbook(){return ebokEbookJavaRepository.findAll();
    }
}
