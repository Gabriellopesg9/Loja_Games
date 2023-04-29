package com.generation.loja_games.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_usuarios")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotNull(message = "O nome é obrigatório!")
	private String nome;
	
	@NotNull(message = "O usuário é obrigatório!")
	@Email(message = "Digite um email válido!")
	private String usuario;
	
	@NotBlank(message = "Digite uma senha!")
	@Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres!")
	private String senha;
	
	
	@Size(max= 5000, message = " O link da foto não pode ter mais de 5000 caracteres!")
	private String foto;
	
	
    
     @JsonFormat(pattern= "yyyy-MM-dd")
	 private LocalDate datadenascimento ;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}


	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	
	

}
