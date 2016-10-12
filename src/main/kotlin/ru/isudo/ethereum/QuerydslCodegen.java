package ru.isudo.ethereum;

import com.querydsl.codegen.GenericExporter;
import com.querydsl.codegen.Keywords;

import javax.persistence.*;
import java.io.File;
import java.io.IOException;


public class QuerydslCodegen {
    public static void main(String[] args) throws IOException {
        GenericExporter exporter = new GenericExporter();
        exporter.setKeywords(Keywords.JPA);
        exporter.setEntityAnnotation(Entity.class);
        exporter.setEmbeddableAnnotation(Embeddable.class);
        exporter.setEmbeddedAnnotation(Embedded.class);
        exporter.setSupertypeAnnotation(MappedSuperclass.class);
        exporter.setSkipAnnotation(Transient.class);
        File folder = new File("src/main/kotlin");
        System.out.println(folder.getAbsoluteFile().getCanonicalFile().toString());
        exporter.setTargetFolder(folder);
        exporter.export(QuerydslCodegen.class.getPackage());
    }
}