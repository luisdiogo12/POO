package aula05.Ex3;

import aula05.Ex1.DateYMD;

public class RealEstate {

	private Property[] properties;
    private int initialId = 1000;

	public void newProperty(String address, int rooms, int price) {
		if (properties == null){
			Property newPeoperty = new Property(initialId++, address, rooms, price);
			properties = new Property[1];
			properties[0] = newPeoperty; //TODO:tem que criar uma classe Property
		}else{
			int lastId = properties[properties.length].getId();
			Property newPeoperty = new Property(lastId++, address, rooms, price);
			Property[] newProperties = new Property[properties.length + 1];
			for (int i = 0; i < properties.length; i++){
				newProperties[i] = properties[i];
			}
			newProperties[properties.length] = newPeoperty;//TODO:tem que criar uma classe Property
			properties = newProperties;
		}

	}

	public void sell(int id) {
        for (Property property : this.properties) {
            if (property != null && property.getId() == id) {
                if (!property.getAvailability()) {
                    System.out.println("Imóvel indisponível.");
                    return;
                } else {
                    property.setAvailability(false);
                    System.out.println("Imóvel vendido.");
                    return;
                }
            }
        }
        System.out.printf("Imóvel %d inexiste.\n", id);
    }

	 public void setAuction(int id, DateYMD date, int duration) {
        for (Property property : this.properties) {
            if (property != null && property.getId() == id) {
                if (!property.getAvailability()) {
                    System.out.printf("Imóvel %d não está disponível.\n", id);
                    return;
                } else {
                    DateYMD end = new DateYMD(date.getDay(), date.getMonth(), date.getYear());
                    end.addDays(duration);
                    property.setAuction(date, end);
                    return;
                }
            }
        }
        System.out.printf("Imóvel %d não existe.\n", id);
    }
	
}
