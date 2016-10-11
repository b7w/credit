package ru.isudo.ethereum.core.model;

import javax.persistence.*;


@Entity
public class Agreement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private String ethId;

    @Column(nullable = false)
    private AgreementStatus status;

    @Column(nullable = false)
    private String createdBy;


    public Long getId() {
        return id;
    }

    public Agreement setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEthId() {
        return ethId;
    }

    public Agreement setEthId(String ethId) {
        this.ethId = ethId;
        return this;
    }

    public AgreementStatus getStatus() {
        return status;
    }

    public Agreement setStatus(AgreementStatus status) {
        this.status = status;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Agreement setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
}