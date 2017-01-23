/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos
* Mario Hernandez, carne 15135
* Luis Carlo Ramirez, carne 15019
* Henry Gomez, carne 15703

* IRadio.java
*Esta es una interfaz que contiene los metodos que seran implementados por los distintos tipos de radio (de carro, de celular o de entretenimiento)
*/

public interface iRadio {
	    public void isOn(boolean siOn);
	    public boolean getFrecuency();
	    public void setFrecuency(boolean frecuency);
	    public void setStation(double newStation);
	    public void saveStation(int btn, double station);
	    public double selectStation(int btn);
	    public double getStation();   
	    public String ToString();
	    public boolean getisOn();
}
