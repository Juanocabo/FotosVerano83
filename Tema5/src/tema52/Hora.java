package tema52;

public class Hora {
	private int hora,min,seg;
public Hora() {
	hora=0;
	min=0;
	seg=0;
}
public Hora(int hora, int min, int seg) {
	this.hora=hora;
	this.min=min;
	this.seg=seg;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}
public int getSeg() {
	return seg;
}
public void setSeg(int seg) {
	this.seg = seg;
}
public void SumHora(int hora) {
	this.hora+=hora;
	if(this.hora>=24) this.hora=this.hora%24;
	if(this.hora<0) this.hora=24-(-this.hora)%24;
}
public void SumMin(int min) {
	this.min+=min;
	if(this.min>=60) {this.min=this.min%60;SumHora((min-min%60)/60);}
	if(this.min<0) {this.min=60-(-this.min)%60;SumHora((min-(-min)%60)/60);}
}
public void SumSeg(int seg) {
	this.seg+=seg;
	if(this.seg>=60) {this.seg=this.seg%60;SumMin((seg-seg%60)/60);}
	if(this.seg<0) {this.seg=60-(-this.seg)%60;SumMin((seg-(-seg)%60)/60);}
}
public void LeerHora(int hora,int min, int seg) {
	setHora(hora);
	setMin(min);
	setSeg(seg);
}
public void ImpHora() {
	if(getSeg()<10) {
	System.out.println(getHora()+":"+getMin()+":0"+getSeg());
}
	else 	System.out.println(getHora()+":"+getMin()+":"+getSeg());
	}
}
