public class calculadora{
    private float valor1;
	private float valor2;
	private float Resposta = 0;
	
	public calculadora() {
		this.valor1 = 0;
		this.valor2 = 0;
		this.Resposta = 0;
	}
	
	public void setvalor1(float  v) {
		this.valor1 = v;
	}
	
	public float getvalor1() {
		return valor1;
	}
	
	public void setvalor2(float  v) {
		this.valor2 = v;
	}
	
	public float getvalor2() {
		return this.valor2;
	}
	
	public void setResposta(float  r) {
		this.Resposta = r;
	}
	
	public float getResposta() {
		return this.Resposta;
	}
	
	public float somar() {
		this.Resposta = this.valor1 + this.valor2;
		return this.Resposta;
	}
}