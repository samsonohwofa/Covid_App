package com.example.DebCovidApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<format> format1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        format1 = new ArrayList<>();
        format1.add(new format("Covid Symptoms","• Fever\n" +
                "• Dry Cough\n" +
                "• Tiredness\n" +
                "• Sore Throat\n" +
                "• Diarrhoea\n" +
                "• Conjunctivitis\n" +
                "• Headache\n" +
                "• Loss of taste or smell\n" +
                "• Rashes\n","Serious symptoms requiring immediate medical attention:",
                "• Difficulty of breathing\n" + "• Chest pain or pressure\n" + "• Loss of speech or movement\n",R.drawable.symptoms));

        format1.add(new format("Test Locations","SYNLAB\n" +
                "\n" +
                "• Address: 4025 Debrecen Miklos u. 5-13\n" +
                "• Opening hours: M-F: 8:00 - 15:00 SAT: 8:00 - 13:00\n" +
                "• Phone: +36 52 500 966, +36 30 815 2261\n" +
                "• Price range: 7000 - 25 000 HUF\n" +
                "• More information: synlab.hu \n" +
                "\n" +
                "MEDICOVER\n" +
                "\n" +
                "• Address: 4026 Debrecen Hunyadi Janos u. 22 - Parizsi Udvar II.\n" +
                "• Opening hours: M-F: 7:00 - 19:00\n" +
                "• Phone: +36 1 465 3131\n" +
                "• Price range: 11 000 - 19 500 HUF\n" +
                "• More information: medicover.hu \n" +
                "\n" +
                "WHITELAB\n" +
                "\n" +
                "• Address: 4027 Debrecen Furedi u. 27.\n" +
                "• Opening hours: every day 7:00 - 13:00\n" +
                "• Phone: +36 70 362 0613\n" +
                "• Price range: 8500 - 19 500 HUF\n" +
                "• More information: whitelab.hu","","\n" +
                "" +
                "" +
                "",R.drawable.test));
        format1.add(new format("Vaccine information","AVAILABLE VACCINE TYPES IN HUNGARY\n" +
                "\n" +
                "• AstraZeneca\n" +
                "• Moderna\n" +
                "• Pfizer/BioNTech\n" + "• Synopharm\n" + "• Sputnik V\n" + "• Johnson&Johnson\n","HOW TO APPLY",
                "For more information visit: eeszt.gov.hu/hu/covid-vaccination-booking\n",R.drawable.vacc));
        format1.add(new format("Public health information","• Maintain at least 1-metre distance from other people\n" +
                "• Wear a mask\n" +
                "• Avoid the 3Cs: Avoid places that are Closed, Crowded or involve Contact\n" +
                "• Meet people outside\n" +
                "• Use hand sanitizer\n" +
                "• Wash your hands regularly\n" +
                "• Avoid crowded places\n" +
                "• Avoid touching your eyes, nose and mouth\n" +
                "• Cover your mouth and nose with your bent elbow or tissue when you cough or sneeze\n" +
                "• Clean and disinfect regularly touched surfaces\n","If you experience covid symptoms:\n",
                "• Stay at home and self isolate if you have mild symptoms\n" +
                        "• If you have more severe symptoms, seek medical attention immediately.\n" +
                        "• First call your local health authority, who will explain the steps to follow.\n" +
                        "• If you think you have Covid, do not attend any medical facility in person until further notice.",R.drawable.sugg));
        format1.add(new format("Volunteer system","We know that the biggest problem during quarantining or self isolating is not being able to handle our everyday tasks like shopping or running errands. To help our community with these problems, we have some amazing volunteers who are willing to offer help while you are self-isolating.\n" +
                "Should you need help with any errands, or even walking your dog, do not hesitate to reach out to our volunteers and ask for help.\n" +
                "\n" +
                "OUR VOLUNTEERS:\n" +
                "\n" +
                "SARAH, 19\n" +
                "• Help with: shopping, going to the pharmacy or post office\n" +
                "• Availability: every weekday 3-6PM\n" +
                "• Contact: volunteer.sarah@debcovidapp.com\n" +
                "\n" +
                "JOHN, 25\n" +
                "• Help with: dog walking, shopping\n" +
                "• Availability: no set schedule, contact to discuss\n" +
                "• Contact: volunteer.john@debcovidapp.com\n" +
                "\n" +
                "ANNE, 16\n" +
                "• Help with: tutoring via Skype\n" +
                "• Availability: Saturday and Sunday afternoon\n" +
                "• Contact: volunteer.anne@debcovidapp.com\n" +
                "\n" +
                "DAVID, 30\n" +
                "• Help with: if you just feel lonely and isolated, and need someone to talk to, reach out to me\n" +
                "• Availability: no set schedule, contact to discuss\n" +
                "• Contact: volunteer.david@debcovidapp.com\n" +
                "\n" +
                "RICHARD, 25\n" +
                "• Help with: dog walking, shopping, running errands\n" +
                "• Availability: every weekday 1-10PM\n" +
                "• Contact: volunteer.richard@debcovidapp.com","HOW TO BE A VOLUNTEER",
                "While we have a few precious volunteers who help immensely, we still need more people as the infection is spreading, more isolating citizens will need assistance.\n" +
                        "\n" + "If you feel like you have some time in your schedule for a good cause, apply to be a volunteer!\n" + "\n" +
                        "To apply, please email us at volunteersystem@debcovidapp.com\n" + "\n" +
                        "Send us a short description about yourself, the times you could be available, and the tasks you would like to do, along with any possible questions you have.",R.drawable.volunteer));
        format1.add(new format("Curfew exemption request","Sometimes there are events in our life which require immediate attention, and we might need to leave our house during curfew." +
                "In case you need to leave the house during curfew, you need to request permission from the local authorities.","How to request a curfew exemption:",
                "1. Send an email to exemption@debcovidapp.com\n" +
                        "2. In the email, include your full name, passport number, date of birth, phone number and home address.\n" +
                        "3. Include the reason for requesting the exemption. You can pick from the following categories:\n" +
                        " - doctor's appointment\n" + " - Going to the pharmacy\n" + " - Attending work\n" + " - Family emergency\n" + " - Traveling\n" + "- Other reason, please specify in the email\n" + "4. Once we receive the email, we will forward your request to the relevant authorities who will send you the permission slip to your email within 24 hours.\n" + "5. Once you received the permission slip, you need to print it or show it on your smartphone if you are asked for it\n" + "6. In case of urgent requests where you cannot wait for the 24 hour validation process, please call us at 0652123454.\n",R.drawable.curfew));
        format1.add(new format("Emergency contact numbers","Ambulance: 104\n" +
                "Poice: 107\n" +
                "Fire station: 105\n" +
                "Emergency phone number: 112\n","Other useful, non-emergency phone numbers:\n",
                "Covid information line: 06-80-277-455\n" +
                        "Help with amending personal information on vaccination certificate: 1818\n" +
                        "Auguszta hospital: 06-52-411-600\n",R.drawable.emergency));
        format1.add(new format("FAQ",
                "Please find the answers to the most frequently asked questions on this page.","Frequently asked questions:\n",
                "WHAT IS THE PURPOSE OF THE APP?\n" +
                "- We know that the situation the world is dealing with is new and scary to all of us, and it is especially confusing for us, international students in a foreign country, where we do not speak the language so we are not really informed about the news regarding Covid. I created this app in hopes that it will help the international student community in Debrecen with navigating the restrictions, vaccines and basically everything regarding what is happening in the world right now.\n" +
                "\n" +
                "WHAT TO DO IF I DID NOT FIND THE ANSWER TO MY QUESTION IN THE APP?\n" +
                "- If you have a specific question we did not answer here, please contact the local health authorities regarding the problem.\n" +
                "\n" +
                "I NEED A VOLUNTEER FOR A SPECIFIC TASK / ON A DAILY BASIS, IS IT POSSIBLE?\n" +
                "- If you need a volunteer for a task not included in the list, or need someone organized for every day, please send us an email to specialrequest@debcovidapp.com and we will try to find a suitable helper in our database for you.\n" +
                "\n" +
                "I RECENTLY CAME IN CONTACT WITH SOMEONE WHO TESTED POSITIVE FOR COVID, WHAT SHOULD I DO?" +
                "- You need to self-isolate and contact the emergency phone number where you will be given further instructions.\n" +
                "\n" +
                "I JUST FOUND OUT I HAVE COVID AND I MET A LOT OF PEOPLE THE PREVIOUS DAYS. WHO SHOULD I NOTIFY?" +
                "- You need to notify everyone you came in contact with the week before you tested positive, and urge them to get tested and self-isolate.\n" +
                "\n" +
                "DO YOU TAKE RESPONSIBILITY FOR THE ADVICE GIVEN IN THIS APP?" +
                "- This app is simply an informatory app based on information gathered from the local government websites, the developer does not take responsibility for any outdated or wrong advice.\n" +
                "\n" +
                "SHOULD I USE SOAP AND WATER OR HAND SANITIZER TO PROTECT MYSELF AGAINST COVID?" +
                "- Handwashing is the best way to protect yourself. Wash your hands often for at least 20 seconds with soap and water, and use hand sanitizer when washing your hand is not possible.\n" +
                "\n" +
                "CAN SOMEONE TEST NEGATIVE, THEN LATER POSITIVE FOR COVID?\n" +
                "- Yes, this is possible unfortunately if the first test was performed in the early stage of the infection. It is also possible you got exposed to covid between the two test. Even if you test negative, you should still try to protect yourself and others.\n" +
                "\n" +
                "CAN PETS SPREAD/GET COVID?\n" +
                "- According to current information, the risk of animals spreading COVID-19 to people is very low.\n" +
                "\n" +
                "IF I ALREADY RECOVERED FROM COVID, SHOULD I STILL GET VACCINATED?\n" +
                "- Yes, as you can get COVID more than once due to the mutations and variants, you definitely should get vaccinated.\n" +
                "\n" +
                "CAN I CHOOSE WHICH VACCINE I WANT TO GET?\n" +
                "- Yes, on the appointment booking website you will see the type of vaccine next to each available appointment.\n" +
                "\n" +
                "IF I AM PREGNANT, CAN I GET VACCINATED?\n" +
                "Yes, you can, however we advise you to consult with your OB/GYN who will determine the risk based on your medical history and the development of the pregnancy.\n" +
                "\n" +
                "CAN I GET THE VACCINE IF I CURRENTLY HAVE COVID-19?\n" +
                "- No, you can not. You need to wait until you recover from the illness and meet the critectia for discontinuing isolation.\n" +
                "\n"+
                "IS IT SAFE TO ORDER TAKEOUT?\n" +
                "Yes, however there are some extra steps we advise you to follow, such as pay online with a card instead of paying with cash to avoid close contact with the delivery person, and if possible, ask for contactless delivery where they place the package in front of your door.\n" +
                "\n" +
                "I HAVE A SUGGESTION REGARDING THE APP, WHERE CAN I CONTACT YOU?\n" +
                "- We are always happy to hear suggestions or feedback about our app, if you have a suggestion please email us at customersupport@debcovidapp.com and we will get back to you with the least possible delay.",R.drawable.faq));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, format1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
