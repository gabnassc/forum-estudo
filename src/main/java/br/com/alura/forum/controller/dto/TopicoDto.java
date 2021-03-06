package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class TopicoDto {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.dataCriacao = topico.getDataCriacao();
        this.mensagem = topico.getMensagem();
        this.titulo = topico.getTitulo();

    }

    public static Page<TopicoDto> converter(org.springframework.data.domain.Page<Topico> topicos) {
        return topicos.map(TopicoDto::new);

    }


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
