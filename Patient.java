import java.io.*;
import java.util.Scanner;

public class Patient extends Person {
    private int Id;
    private boolean corona;
    private LessCommonSymptoms lessCommonSymptoms;
    private CommonSymptoms commonSymptoms;
    private SeriousSymptoms seriousSymptoms;
    private int quarantineFirstDay;
    private int quarantineFirstMonth;
    private int quarantineFirstYear;

    public Patient() {
        Id = 0;
        lessCommonSymptoms = new LessCommonSymptoms();
        commonSymptoms = new CommonSymptoms();
        seriousSymptoms = new SeriousSymptoms();

    }

    public Patient(String name, int age, String email, String phoneNumber, int id, boolean bodyPain, boolean soreThroat, boolean diarrhea, boolean conjunctivitis,
                   boolean headache, boolean lossOfTasteAndSmell, boolean rashOnSkin, float temp, boolean dryCough, boolean tiredness, boolean difficultBreathing,
                   boolean chestPain, boolean lossOfSpeech, boolean lossOfMovement) {
        super(name, age, email, phoneNumber);
        this.Id = id;
        lessCommonSymptoms = new LessCommonSymptoms(bodyPain, soreThroat, diarrhea, conjunctivitis, headache, lossOfTasteAndSmell, rashOnSkin);
        commonSymptoms = new CommonSymptoms(temp, dryCough, tiredness);
        seriousSymptoms = new SeriousSymptoms(difficultBreathing, chestPain, lossOfSpeech, lossOfMovement);
    }

    public void setPerson(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LessCommonSymptoms getLessCommonSymptoms() {
        return lessCommonSymptoms;
    }

    public void setLessCommonSymptoms(boolean bodyPain, boolean soreThroat, boolean diarrhea, boolean conjunctivitis, boolean headache, boolean lossOfTasteAndSmell, boolean rashOnSkin) {
        lessCommonSymptoms.setBodyPain(bodyPain);
        lessCommonSymptoms.setSoreThroat(soreThroat);
        lessCommonSymptoms.setDiarrhea(diarrhea);
        lessCommonSymptoms.setConjunctivitis(conjunctivitis);
        lessCommonSymptoms.setHeadache(headache);
        lessCommonSymptoms.setRashOnSkin(rashOnSkin);

    }

    public CommonSymptoms getCommonSymptoms() {
        return commonSymptoms;
    }

    public void setCommonSymptoms(float temp, boolean dryCough, boolean tiredness) {
        commonSymptoms.setTemp(temp);
        commonSymptoms.setDryCough(dryCough);
        commonSymptoms.setTiredness(tiredness);
    }

    public SeriousSymptoms getSeriousSymptoms() {
        return seriousSymptoms;
    }

    public void setSeriousSymptoms(boolean difficultBreathing, boolean chestPain, boolean lossOfSpeech, boolean lossOfMovement) {
        seriousSymptoms.setDifficultBreathing(difficultBreathing);
        seriousSymptoms.setChestPain(chestPain);
        seriousSymptoms.setLossOfSpeech(lossOfSpeech);
        seriousSymptoms.setLossOfMovement(lossOfMovement);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Id=" + Id +
                ", lessCommonSymptoms=" + lessCommonSymptoms +
                ", commonSymptoms=" + commonSymptoms +
                ", seriousSymptoms=" + seriousSymptoms +
                '}';
    }
public void QuarantineTest()
{
    String MName,MEmail,MPhone;
    Scanner input = new Scanner(System.in);
    int MAge;
    System.out.println();
    System.out.println("------------Welcome to online Corona Testing Service------------");
    System.out.println("You need to enter some of your details for sake of Testing Records");
    System.out.println();
    System.out.println("Enter Your Name");
    MName = input.nextLine();
    System.out.println("Enter Your Email");
    MEmail = input.nextLine();
    System.out.println("Enter Your Phone Number");
    MPhone = input.nextLine();
    System.out.println("Enter Your Age");
    MAge = input.nextInt();

    setPerson(MName,MAge,MEmail,MPhone);
    System.out.println("<--------------Now we are going to conduct the COVID-19 test-------------->\n" +
            "<-------------- Give the correct answers-------------->\n<--------------Type true for yes and false for no-------------->");

    boolean MdifficultBreathing;
    boolean MchestPain;
    boolean MlossOfSpeech;
    boolean MlossOfMovement;

    System.out.println("Do you have any Difficulty in Breathing?");
    MdifficultBreathing = input.nextBoolean();
    System.out.println("Do you have any chest Pain?");
    MchestPain = input.nextBoolean();
    System.out.println("Do you face loss of speech?");
    MlossOfSpeech = input.nextBoolean();
    System.out.println("Do you face any loss in your movement?");
    MlossOfMovement = input.nextBoolean();
    setSeriousSymptoms(MdifficultBreathing,MchestPain,MlossOfSpeech,MlossOfMovement);

    float Mtemp;
    boolean MdryCough;
    boolean Mtiredness;
    System.out.println("Enter your Temperature?");
    Mtemp = input.nextFloat();
    System.out.println("Do you have Dry Cough?");
    MdryCough = input.nextBoolean();
    System.out.println("Do you feel any tiredness?");
    Mtiredness = input.nextBoolean();
    setCommonSymptoms(Mtemp,MdryCough,Mtiredness);

    boolean MbodyPain;
    boolean MsoreThroat;
    boolean Mdiarrhea;
    boolean Mconjunctivitis;
    boolean Mheadache;
    boolean MlossOfTasteAndSmell;
    boolean MrashOnSkin;
    System.out.println("Do you feel any bodyPain?");
    MbodyPain = input.nextBoolean();
    System.out.println("Do you have sore throat?");
    MsoreThroat = input.nextBoolean();
    System.out.println("Do you have diarrhea?");
    Mdiarrhea = input.nextBoolean();
    System.out.println("Do you feel inflammation or redness in your eyes?");
    Mconjunctivitis = input.nextBoolean();
    System.out.println("Do you feel headache?");
    Mheadache = input.nextBoolean();
    System.out.println("Do you feel lost of taste and smell?");
    MlossOfTasteAndSmell = input.nextBoolean();
    System.out.println("Do you have any rashes on your skin?");
    MrashOnSkin = input.nextBoolean();
    setLessCommonSymptoms(MbodyPain,MsoreThroat,Mdiarrhea,Mconjunctivitis,Mheadache,MlossOfTasteAndSmell,MrashOnSkin);

}
    public void CoronaResults() {
        boolean quarintineOption = false;
        Scanner input = new Scanner(System.in);
        String Answers;
        System.out.println();
        System.out.println("---------Corona Results---------");
        if (lessCommonSymptoms.LessCommonSymptomsTruth()>0 && commonSymptoms.CommonSymptomsTruth()>1 && seriousSymptoms.SeriousSymptomsTruth()> 2) {
            System.out.println("You should immediately contact the hospital");
            corona = true;
            if (corona == true) {
                System.out.println("You are tested corona positive");
            }


        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>1 && (commonSymptoms.CommonSymptomsTruth()>1 && seriousSymptoms.SeriousSymptomsTruth()> 3)) {
            System.out.println("You should immediately contact the hospital");
            corona = true;
            if (corona == true) {
                System.out.println("You are tested corona positive");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 && (commonSymptoms.CommonSymptomsTruth()>2 && seriousSymptoms.SeriousSymptomsTruth()>3) ){
            System.out.println("You should immediately contact the hospital");
            corona = true;
            if (corona == true) {
                System.out.println("You are tested corona positive");
            }
        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 && (commonSymptoms.CommonSymptomsTruth()>1 || seriousSymptoms.SeriousSymptomsTruth()> 1)) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers == "yes" || Answers == "Yes") {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 && commonSymptoms.CommonSymptomsTruth()>1  && seriousSymptoms.SeriousSymptomsTruth()>1) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers.equals("yes") || Answers.equals("Yes")) {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 && commonSymptoms.CommonSymptomsTruth()>1 && seriousSymptoms.SeriousSymptomsTruth()> 1) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers.equals("yes") || Answers.equals("Yes")) {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 && commonSymptoms.CommonSymptomsTruth()>1 && seriousSymptoms.SeriousSymptomsTruth()> 2) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers.equals("yes") || Answers.equals("Yes")) {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>2 && commonSymptoms.CommonSymptomsTruth()>1 || seriousSymptoms.SeriousSymptomsTruth()> 2) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers.equals("yes") || Answers.equals("Yes")) {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else if (lessCommonSymptoms.LessCommonSymptomsTruth()>3 || commonSymptoms.CommonSymptomsTruth()>1 || seriousSymptoms.SeriousSymptomsTruth()> 1) {
            corona = true;
            System.out.println("You have obvious symptoms of Corona Virus");
            System.out.println("It is recommended to stay in Quarantine or contact the hospital");
            System.out.println("If you want to stay at home and start Quarantine write yes or write no to refuse the system");
            Answers = input.nextLine();
            if (Answers.equals("yes") || Answers.equals("Yes")) {
                QuarantineRegister();
            }
            else
            {
                System.out.println("You Should Contact a doctor at nearby hospital\nAs you have refused the system to start quarintine");
            }

        } else {
            System.out.println("You have No symptoms of Corona Virus");
            System.out.println("It is recommended to stay at home for your safety");
            System.out.println("If you feel any changes in your symptoms, get the online test done again");

        }
        SavedData();
        System.out.println("----------Kindly Open the Main Menu---------");
    }

    public void SavedData() {
        try {
            FileWriter fw = new FileWriter("userData.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

                fw.write("Name: " + name +"\r\n"+ "Age: " + age +"\r\n"+ "Email: " + email +"\r\n"+ "Phone Number:" + phoneNumber +"\r\n"+ "Corona Test: "+"\r\n"+ corona + "\r\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void QuarantineRegistrationDataStorage() {
        try {
            FileWriter fw = new FileWriter("QuarantineRegistrationData.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(name+"\r\n"+email+"\r\n"+ phoneNumber+"\r\n"+quarantineFirstDay+"\r\n"+quarantineFirstMonth+"\r\n"+quarantineFirstYear+"\r\n" );
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void QuarantineDataStorage() {
        try {
            FileWriter fw = new FileWriter("QuarantineLoginData.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(email+"\r\n"+ phoneNumber+"\r\n"+quarantineFirstDay+"\r\n" );
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadQuarantineData() throws IOException {
        String loginEmail, loginNumber;
        System.out.println("Enter your Email");
        Scanner input = new Scanner(System.in);
        loginEmail = input.nextLine();
        System.out.println("Enter your Phone Number");
        loginNumber = input.nextLine();
            FileReader fr = new FileReader("QuarantineLoginData.txt");
            BufferedReader br = new BufferedReader(fr);
            String fEmail;
            String fNumber;
            int fFirstDay;
        String login = "";
            while( (fEmail = br.readLine())!=null)
            {
                fNumber = br.readLine();
                fFirstDay = Integer.parseInt(br.readLine());


                if(loginNumber.equals(fNumber)&&loginEmail.equals(fEmail)) {
                    login = "Successful Login";
                    System.out.println(login);
                    quarantineFirstDay = fFirstDay;
                    System.out.println("--------------Welcome to your 14 Day Quarantine plan--------------");
                    Quarantineplan();

                    break;

                }
            }
if(login != "Successful Login")
{
    System.out.println("Wrong Details Entered");
}





        }
    public void QuarantineRegister() {
        String MName,MEmail,MPhone;
        int MAge;
        Scanner input = new Scanner(System.in);
        System.out.println("---Welcome to Quarantine Registration---");
        System.out.println("Enter all your details");
        System.out.println("Enter Your Name");
        MName = input.nextLine();
        System.out.println("Enter Your Email");
        MEmail = input.nextLine();
        System.out.println("Enter Your Phone Number");
        MPhone = input.nextLine();
        System.out.println("Enter Your Age");
        MAge = input.nextInt();

        setPerson(MName,MAge,MEmail,MPhone);
        System.out.println("Enter The starting Date of Quarantine:");
        quarantineFirstDay = input.nextInt();
        System.out.println("Enter The starting Month of Quarantine:(in numbers)");
        quarantineFirstMonth = input.nextInt();
        System.out.println("Enter The starting Year of Quarantine:");
        quarantineFirstYear = input.nextInt();
        QuarantineRegistrationDataStorage();
        QuarantineDataStorage();
        System.out.println("----------Kindly Open the Main Menu---------");


    }



    public void Quarantineplan() throws IOException {

        int today,dayone,lastday;
        dayone=quarantineFirstDay;
        lastday=quarantineFirstDay+13;
        boolean answer;
        float Rightnowfever;
        Scanner input = new Scanner(System.in);
        System.out.println("First day of your Quarantine:"+quarantineFirstDay);
        System.out.println("Enter today's Date");
        today = input.nextInt();
        if(today==dayone)
        {
            System.out.println("-Today is the first day of your Quarantine");
            System.out.println("-Make sure you visit us everyday to ensure best of your health");
            System.out.println("-It is your responsibility now to isolate yourself and stay at one place for next 14 days without any contact");
            System.out.println("-Do not go to work/school/public areas\n" +
                    "-Avoid public transportation/ride-sharing/taxis\n" +
                    "-Separate yourself from other people and animals in your home\n" +
                    "-Do not welcome visitors into your home\n" +
                    "-Use a separate bathroom, if available, and separate towels\n" +
                    "-Use separate dishes and utensils\n" +
                    "-Cover your coughs and sneezes with the inside of your elbow or with a tissue, throwing the tissue away immediately afterwards\n" +
                    "-People previously diagnosed with COVID-19 should wear a face mask when around other people if they are still having symptoms\n" +
                    "-Clean high-touch surfaces every day with disinfectant, such as  tables, doorknobs, toilets and computer keyboards");

            System.out.println("<--------------Use true or false for yes or no------------>");
            System.out.println("What is your body temperature (in Farenheit)?");
            Rightnowfever = input.nextFloat();
            if(Rightnowfever>98.6)
            {
                System.out.println("Take one Paracetamol 500mg.");
            }
            else
            {
                System.out.println("Your body temperature is optimal.");
            }
            System.out.println("Do you have any body ache?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("have you taken paracetamol?");
                answer = input.nextBoolean();
                if(answer==true)
                {
                    System.out.println("Wait for an hour if pain does not go away take  TYLENOL® (acetaminophen) 500 mg.");
                }
                else
                {
                    System.out.println("take  TYLENOL® (acetaminophen) 500 mg.");
                }
            }
            else
            {
                System.out.println("Alright ");
            }
            System.out.println("Do you have sore throat?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("Do Gargles with salt water.");
                System.out.println("Take ibuprofen 5-10 ml");
            }
            else
            {
                System.out.println("OK");
            }

            System.out.println("Do you have cough?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("Consume one tbsp of hydryllin syrup twice a day.");

            }
            else
            {
                System.out.println("OK");
            }

            System.out.println("-------------General Advice------------");
            System.out.println("<----Drink minimal 2 litres of water---->");
            System.out.println("<----Consume food with Protein and Vitamin C such as Oranges,Spinach,Peas and Capsicum---->");
            System.out.println("<----Drink a glass of hot water with half lemon squeezed in it---->");
            System.out.println("<----Drink a glass of milk with turmeric in it\nPro Tip: if you can not drink due to bitterness add some chocolate powder in it :) ----> ");

        }
        else if(today>dayone || today<=lastday )
        {
            if(today==dayone+1)
            {
                System.out.println("It is you 2nd day");
            }
            else if(today==dayone+2)
            {
                System.out.println("It is you 3rd day");
            }
            else if(today==dayone+3)
            {
                System.out.println("It is you 4th day");
            }
            else if(today==dayone+4)
            {
                System.out.println("It is you 5th day");
            }
            else if(today==dayone+5)
            {
                System.out.println("It is you 6th day");
            }
            else if(today==dayone+6)
            {
                System.out.println("It is you 7th day");
            }
            else if(today==dayone+7)
            {
                System.out.println("It is you 8th day");
            }
            else if(today==dayone+8)
            {
                System.out.println("It is you 9th day");
            }
            else if(today==dayone+9)
            {
                System.out.println("It is you 10th day");
            }
            else if(today==dayone+10)
            {
                System.out.println("It is you 11th day");
            }
            else if(today==dayone+11)
            {
                System.out.println("It is you 12th day");
            }

            else if(today==dayone+12)
            {
                System.out.println("It is you 13th day");
            }
            else if(today==dayone+13)
            {
                System.out.println("It is you 14th day (LAST DAY)");
            }
            else
            {
                System.out.println("You have entered wrong day");
            }

            System.out.println("<--------------Use true or false for yes or no------------>");

            System.out.println("Do you feel improved energy in your body");
            answer = input.nextBoolean();
            if (answer == true)
            {
                System.out.println("Keep Going you need to brace yourself!");
            }
            else
            {
                System.out.println("Practice some yoga and do some simple exercises it will make you feel energetic and will give you energy to fight");
            }


            System.out.println("Did you drink lemon Water");
            answer = input.nextBoolean();
            if(answer == true)
            {
                System.out.println("Good Job!");
            }
            else
            {
                System.out.println("Make sure to drink to lemon water today it helps you to boost your immune ");
            }
            System.out.println("Did you drink Turmeric milk");
            answer = input.nextBoolean();
            if(answer == true)
            {
                System.out.println("Good Job!");
            }
            else
            {
                System.out.println("Make sure to drink Turmeric milk today it helps you to boost your immune and fight with corona virus ");
            }


            System.out.println("What is your body temperature (in Farenheit)?");
            Rightnowfever = input.nextFloat();
            if(Rightnowfever>98.6)
            {
                System.out.println("Take one Paracetamol 500mg.");
            }
            else
            {
                System.out.println("Your body temperature is optimal.");
            }
            System.out.println("Do you have any body ache?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("have you taken paracetamol?");
                answer = input.nextBoolean();
                if(answer==true)
                {
                    System.out.println("Wait for an hour if pain does not go away take  TYLENOL® (acetaminophen) 500 mg.");
                }
                else
                {
                    System.out.println("take  TYLENOL® (acetaminophen) 500 mg.");
                }
            }
            else
            {
                System.out.println("Alright ");
            }
            System.out.println("Do you have sore throat?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("Do Gargles with salt water.");
                System.out.println("Take ibuprofen 5-10 ml");
            }
            else
            {
                System.out.println("OK");
            }

            System.out.println("Do you have cough?");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("Consume one tbsp of hydryllin syrup twice a day.");

            }
            else
            {
                System.out.println("OK");
            }


            System.out.println("-------------General Advice------------");
            System.out.println("<----Drink minimal 2 litres of water---->");
            System.out.println("<----Consume food with Protein and Vitamin C such as Oranges,Spinach,Peas and Capsicum---->");
            System.out.println("<----Drink a glass of hot water with half lemon squeezed in it---->");
            System.out.println("<----Drink a glass of milk with turmeric in it\nPro Tip: if you can not drink due to bitterness add some chocolate powder in it :) ----> ");
            System.out.println("-Do you have worsening condition as loss of movement or speech or your are unable to breath");
            answer = input.nextBoolean();
            if(answer==true)
            {
                System.out.println("Kindly immediately contact a doctor nearby");
                System.out.println("Do you want to end the quarantine and get hospitilized");
                answer = input.nextBoolean();
                if(answer==true)
                {
                    System.out.println("Your Quarantine has been ended");

                }
            }
            System.out.println("This was all for today comeback tommorrow for everday complete check ");
        }

    else
        {
            System.out.println("Try logging in again");
        }
        System.out.println("----------Kindly Open the Main Menu---------");
    }
    public void QuarantineNumber() throws IOException {
        int count=0;
        FileReader fr = new FileReader("QuarantineRegistrationData.txt");
        BufferedReader br = new BufferedReader(fr);

        while( (br.readLine())!=null)
        {
            br.readLine();

            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            count++;


        }
        System.out.println("Total people in Quarantine:"+count);
        System.out.println("----------Kindly Open the Main Menu---------");

    }

    public void CovidTestNumber() throws IOException {
        int count=0;
        FileReader fr = new FileReader("userData.txt");
        BufferedReader br = new BufferedReader(fr);
        String login = "";
        while( (br.readLine())!=null)
        {
            br.readLine();

            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            count++;


        }
        System.out.println("Total Number of tests Conducted:"+count);
        System.out.println("----------Kindly Open the Main Menu---------");
    }
    }




