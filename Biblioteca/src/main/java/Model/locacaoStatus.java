package Model;

public class locacaoStatus {
	int reservada;
	int efetivada;
	int finalizada;
	LocacaoItem locacaoItem;
	
	public locacaoStatus() {
		
	}

	 public locacaoStatus(int reservada, int efetivada, int finalizada, LocacaoItem locacaoItem) {
			
			this.reservada = reservada;
			this.efetivada = efetivada;
			this.finalizada = finalizada;
			this.locacaoItem = locacaoItem;
	}
 
	 public int getreservada() {
		 return reservada;
	 }
	 public void setreservada(int reservada) {
		 this.reservada = reservada;
	 }
	 
	 public int getefetivada() {
		 return efetivada;
	 }
	 public void setefetivada(int efetivada) {
		 this.efetivada = efetivada;
	 }
	 
	 public int getfinalizada() {
		 return finalizada;
	 }
	 public void setfinalizada(int finalizada) {
		 this.finalizada = finalizada;
	 }
	 
	 public LocacaoItem getlocacaoItem() {
		 return locacaoItem;
	 }
	 public void setlocacaoItem(LocacaoItem locacaoItem) {
		 this.locacaoItem = locacaoItem;
	 }
}
