
public class Radio implements iRadio {

	    boolean isOn; 
	    boolean frecuency;
	    double station; 
	    public double[][] botones; /*arreglo con las 24 emisoras AM y FM que van a estar guardadas en los botones*/ 
	    public Radio(){
	        isOn = false;
	        frecuency = true ;
	        station = 87.9;    
	        botones = new double[2][12];
	        for (int i=0; i<11; i++){
	            botones[0][i]=(87.9+i);
	        }
	        for (int i=0; i<11; i=i+10){
	            botones[1][i]=(530+i);
	        }
	    }
	    
	    @Override
	    public void isOn(boolean isOn){
	        if (isOn==true){
	            this.isOn=false;
	        }
	        else{
	            this.isOn=true;
	        }
	    }
	    
	    @Override
	    public void setStation(double newStation){
	        station=newStation;
	    }
	    
	    @Override
	    public void setFrecuency(boolean frecuency){
	        if (frecuency==true){
	            this.frecuency=false;
	        }
	        else{
	            this.frecuency=true;
	        }
	    }

	    @Override
	    public double getStation() {
	        return station;
	    }

	    @Override
	    public boolean getisOn() {
	        return isOn;
	    }

	   
	    @Override
	    public String ToString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("isON:");
	        sb.append(isOn);
	        sb.append(" Frecuency:");
	        sb.append(frecuency);
	        sb.append(" Station:");
	        sb.append(station);
	        
	        return sb.toString();

	    }
	    
	    @Override
	    public double selectStation(int btn){
	        return station;
	    }
	    
	    @Override
	    public void saveStation(int btn, double emisora){
	        
	    }

		@Override
		public boolean getFrecuency() {
			// TODO Auto-generated method stub
			return frecuency;
		}

		
	    
	}


