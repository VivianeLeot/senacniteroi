package model;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String prdNome;
	private Integer prdPreco;
	private Integer prdQuantidade;
	private String prdDescriçao;
	private String prdImg;
	
	public Produto() {
		
	}
	
	public Long getId() {
		return id;
	}

	public String getPrdNome() {
		return prdNome;
	}

	public void setPrdNome(String prdNome) {
		this.prdNome = prdNome;
	}

	public Integer getPrdPreco() {
		return prdPreco;
	}

	public void setPrdPreco(Integer prdPreco) {
		this.prdPreco = prdPreco;
	}

	public Integer getPrdQuantidade() {
		return prdQuantidade;
	}

	public void setPrdQuantidade(Integer prdQuantidade) {
		this.prdQuantidade = prdQuantidade;
	}

	public String getPrdDescriçao() {
		return prdDescriçao;
	}

	public void setPrdDescriçao(String prdDescriçao) {
		this.prdDescriçao = prdDescriçao;
	}

	public String getPrdImg() {
		return prdImg;
	}

	public void setPrdImg(String prdImg) {
		this.prdImg = prdImg;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prdNome == null) ? 0 : prdNome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			return false;
		} else if (!id.equals(other.id))
			return false;
		if (prdNome == null) {
			return false;
		} else if (!prdNome.equals(other.prdNome))
			return false;
		return true;
	}
	
	
	
}
