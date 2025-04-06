package ru.dancrise.spring.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class OpenQuestionCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long code;

    @Column
    private String id;

    @Column
    private String title;

    public String getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = String.valueOf(id);
    }

    public Long getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = Long.valueOf(code);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
