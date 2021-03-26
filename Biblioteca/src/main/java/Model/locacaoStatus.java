package Model;

public enum locacaoStatus {
	RESERVADA, EFETIVADA, FINALIZADA;
	LocacaoItem locacaoItem;	
	
	 
	 public LocacaoItem getlocacaoItem() {
		 return locacaoItem;
	 }
	 public void setlocacaoItem(LocacaoItem locacaoItem) {
		 this.locacaoItem = locacaoItem;
	 }
}
