package com.elasticSearch.wangsf.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "es_data")
public class EsDataEntity {
}
