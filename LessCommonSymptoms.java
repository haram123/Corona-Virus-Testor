public class LessCommonSymptoms {

    private boolean bodyPain;
    private boolean soreThroat;
    private boolean diarrhea;
    private boolean conjunctivitis;
    private boolean headache;
    private boolean lossOfTasteAndSmell;
    private boolean rashOnSkin;

    public  LessCommonSymptoms()
    {
        bodyPain = false;
        soreThroat = false;
        diarrhea = false;
        conjunctivitis = false;
        headache = false;
        lossOfTasteAndSmell = false;
        rashOnSkin = false;
    }

    public LessCommonSymptoms(boolean bodyPain, boolean soreThroat, boolean diarrhea, boolean conjunctivitis, boolean headache, boolean lossOfTasteAndSmell, boolean rashOnSkin)
    {
        this.bodyPain = bodyPain;
        this.soreThroat = soreThroat;
        this.diarrhea = diarrhea;
        this.conjunctivitis = conjunctivitis;
        this.headache = headache;
        this.lossOfTasteAndSmell = lossOfTasteAndSmell;
        this.rashOnSkin = rashOnSkin;
    }

    public boolean isBodyPain() {
        return bodyPain;
    }

    public void setBodyPain(boolean bodyPain) {
        this.bodyPain = bodyPain;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isConjunctivitis() {
        return conjunctivitis;
    }

    public void setConjunctivitis(boolean conjunctivitis) {
        this.conjunctivitis = conjunctivitis;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isLossOfTAsteAndSmell() {
        return lossOfTasteAndSmell;
    }

    public void setLossOfTAsteAndSmell(boolean lossOfTAsteAndSmell) {
        this.lossOfTasteAndSmell = lossOfTAsteAndSmell;
    }

    public boolean isRashOnSkin() {
        return rashOnSkin;
    }

    public void setRashOnSkin(boolean rashOnSkin) {
        this.rashOnSkin = rashOnSkin;
    }

    public int LessCommonSymptomsTruth()
    {
        if((isBodyPain() == true) && (isConjunctivitis() == true) && (isDiarrhea() == true) &&
                (isHeadache() == true) && (isLossOfTAsteAndSmell() == true) && (isRashOnSkin() == true) &&
                (isSoreThroat() == true))
        {
            return 7;
        }
        else if ((isBodyPain() == true && isConjunctivitis() == true && isDiarrhea() == true &&
                isHeadache() == true && isLossOfTAsteAndSmell() == true && isRashOnSkin() == false &&
                isSoreThroat() == true)||(isBodyPain() == true && isConjunctivitis() == false && isDiarrhea() == true &&
                isHeadache() == true && isLossOfTAsteAndSmell() == true && isRashOnSkin() == true &&
                isSoreThroat() == true))
        {
            return 6;
        }
        else if((isBodyPain() == true && isConjunctivitis() == true && isDiarrhea() == true &&
                isHeadache() == true && isLossOfTAsteAndSmell() == true && isRashOnSkin() == false &&
                isSoreThroat() == false)||(isBodyPain() == true && isConjunctivitis() == false && isDiarrhea() == false &&
                isHeadache() == true && isLossOfTAsteAndSmell() == true && isRashOnSkin() == true &&
                isSoreThroat() == true))
        {
            return 5;
        }
        else if((isBodyPain() == true && isLossOfTAsteAndSmell() == true && isDiarrhea() == true &&
                isHeadache() == true && isConjunctivitis() == false && isRashOnSkin() == false &&
                isSoreThroat() == false)||(isBodyPain() == false && isLossOfTAsteAndSmell() == false && isDiarrhea() == false &&
            isHeadache() == true && isConjunctivitis() == true && isRashOnSkin() == true &&
            isSoreThroat() == true))
    {
        return 4;
    }
        else if((isBodyPain() == true && isLossOfTAsteAndSmell() == true &&
                isHeadache() == true && isConjunctivitis() == false && isRashOnSkin() == false &&
                isSoreThroat() == false && isDiarrhea() == false )||(isBodyPain() == false && isLossOfTAsteAndSmell() == false && isDiarrhea() == false &&
            isHeadache() == false && isConjunctivitis() == true && isRashOnSkin() == true &&
            isSoreThroat() == true))
        {
            return 3;
        }

        else if(isBodyPain() == true && isLossOfTAsteAndSmell() == true &&
                isHeadache() == false && (isConjunctivitis() == false && isRashOnSkin() == false &&
                isSoreThroat() == false && isDiarrhea() == false ))
        {
            return 2;
        }
        else
        {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "LessCommonSymptoms{" +
                "bodyPain=" + bodyPain +
                ", soreThroat=" + soreThroat +
                ", diarrhea=" + diarrhea +
                ", conjunctivitis=" + conjunctivitis +
                ", headache=" + headache +
                ", lossOfTAsteAndSmell=" + lossOfTasteAndSmell +
                ", rashOnSkin=" + rashOnSkin +
                '}';
    }
}
