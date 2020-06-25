public class SeriousSymptoms {
    private boolean difficultBreathing;
    private boolean chestPain;
    private boolean lossOfSpeech;
    private boolean lossOfMovement;

    public SeriousSymptoms()
    {
        difficultBreathing=false;
        chestPain=false;
        lossOfSpeech=false;
        lossOfMovement=false;
    }
    public SeriousSymptoms(boolean difficultBreathing, boolean chestPain, boolean lossOfSpeech, boolean lossOfMovement) {
        this.difficultBreathing = difficultBreathing;
        this.chestPain = chestPain;
        this.lossOfSpeech = lossOfSpeech;
        this.lossOfMovement = lossOfMovement;
    }

    public boolean isDifficultBreathing() {
        return difficultBreathing;
    }

    public void setDifficultBreathing(boolean difficultBreathing) {
        this.difficultBreathing = difficultBreathing;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public boolean isLossOfSpeech() {
        return lossOfSpeech;
    }

    public void setLossOfSpeech(boolean lossOfSpeech) {
        this.lossOfSpeech = lossOfSpeech;
    }

    public boolean isLossOfMovement() {
        return lossOfMovement;
    }

    public void setLossOfMovement(boolean lossOfMovement) {
        this.lossOfMovement = lossOfMovement;
    }

    public int SeriousSymptomsTruth()
    {
        if(isChestPain() == true && isDifficultBreathing() == true && (isLossOfMovement() == true && isLossOfSpeech() == true))
        {
            return 4;
        }

       else if(isChestPain() == true && isDifficultBreathing() == true && isLossOfMovement() == true && isLossOfSpeech() == false)
        {
            return 3;
        }

        else if(isChestPain() == true || isDifficultBreathing() == true || (isLossOfMovement() == true || isLossOfSpeech() == true))
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
        return "SeriousSymptoms{" +
                "difficultBreathing=" + difficultBreathing +
                ", chestPain=" + chestPain +
                ", lossOfSpeech=" + lossOfSpeech +
                ", lossOfMovement=" + lossOfMovement +
                '}';
    }
}
