package com.ebookmysql.repository;

import com.ebookmysql.domain.EbookSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookSqlRepository extends JpaRepository< EbookSql, Long > {
}
