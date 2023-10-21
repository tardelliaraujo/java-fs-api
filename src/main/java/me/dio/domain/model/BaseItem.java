Claro, você pode adicionar um campo para a data de criação e um campo para a data de atualização. Aqui está como você poderia fazer isso:

        Java
        Código gerado por IA. Examine e use com cuidado. Mais informações em perguntas frequentes.

        package me.dio.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String description;

    // Novo campo para a data de criação
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Novo campo para a data de atualização
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters e setters para os novos campos
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
    Espero que isso ajude! Se você tiver mais perguntas ou precisar de mais ajuda, fique à vontade para perguntar. 😊