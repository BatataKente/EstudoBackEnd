package com.example.extudoBackEnd.domain;

import com.example.extudoBackEnd.domain.enums.Priority;
import com.example.extudoBackEnd.domain.enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Call {
    private Integer id;
    private LocalDate openedAt = LocalDate.now();
    private LocalDate closedAt;
    private Priority priority;
    private Status status;
    private String comments;
    private String title;
    private Technician technician;
    private Client client;
    public Call() {
        super();
    }
    public Call(Integer id, Priority priority, Status status, String comments, String title, Technician technician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.comments = comments;
        this.title = title;
        this.technician = technician;
        this.client = client;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getOpenedAt() {
        return openedAt;
    }
    public void setOpenedAt(LocalDate openedAt) {
        this.openedAt = openedAt;
    }
    public LocalDate getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(LocalDate closedAt) {
        this.closedAt = closedAt;
    }
    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Technician getTechnician() {
        return technician;
    }
    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call call = (Call) o;
        return Objects.equals(id, call.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
