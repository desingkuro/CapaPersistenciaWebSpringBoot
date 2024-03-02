package com.taller1.poryecto1.tablas;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class Mensajes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creador;
    private String destinatario;
    private String contenido;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @ManyToOne()
    @JoinColumn(name = "id_usuario",nullable = false)
    private Usuarios usuario;
}
