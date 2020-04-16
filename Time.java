public class Time{
private int hora;
private int minu;
private int segu;

public void setTime( int h, int m, int s){
this.hora = h;
this.minu = m;
this.segu = s;

}
public void exibirHoraUniversal(){

System.out.println(this.hora+":"+this.minu+":"+this.segu);
}

public void exibirHoraPadrao(){
String sufixo;
int horaPadrao
if (this.hora==0){
horaPadrao=12;
sufixo="AM";
}
else if (hora ==12) {
horaPadrao = this.hora - 12;
sufixo = "PM";
}else{
    horaPadrao = this.hora;
    sufixo = "AM";
}

}



}