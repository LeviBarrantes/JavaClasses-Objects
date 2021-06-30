package com.tts;

public class VetOffice {
    private String petName;
    private String petBread;
    private int petAge;
    private String ownerName;

    public VetOffice() {
    }

    public VetOffice(String petName, String petBread, int petAge) {
        this.petName = petName;
        this.petBread = petBread;
        this.petAge = petAge;
    }

    public VetOffice(String petName, String petBread, int petAge, String ownerName) {
        this.petName = petName;
        this.petBread = petBread;
        this.petAge = petAge;
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBread() {
        return petBread;
    }

    public void setPetBread(String petBread) {
        this.petBread = petBread;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isaDog() {
        return true;
    }
    public String healthProblems() {
        return "Pet need medication";
    }

    public String provideMedication(String medicationType) {

        return medicationType;

    }


    public static void main(String[] args) {
        VetOffice vetOffice = new VetOffice("Kaha", "Japanese Akita ", 7,"Levi");
        System.out.println(vetOffice.provideMedication("Dog needs antibiotics"));
        String aDog = "Dog";
    }
}
