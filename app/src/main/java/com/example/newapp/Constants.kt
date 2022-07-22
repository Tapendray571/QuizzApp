package com.example.newapp

import java.util.ArrayList

object Constants {


    const val User_Name: String ="user_name"
    const val TOTAL_QUESTION:String="Total_question"
    const val CORRECT_ANSWER:String="Correct_answer"



    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "The early effect in a bipolar junction transistor is caused by",
            "fast turn-on",
            "fast turn-off",
            "large collector-base reverse bias",
            " large emitter-base forward bias",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            " MOSFET can be used as a",
            "current controlled capacitor",
            " voltage controlled capacitor",
            "current controlled inductor",
            "voltage controlled inductors",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Thermal runaway is not possible in FET because as the temperature of FET increases",
            "the mobility decreases",
            "the transconductance increases",
            "the drain current increases",
            "none of the above",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "A source follower using an FET usually has a voltage gain which is",
            "greater than +100",
            "slightly less than unity but positive",
            "exactly unity but negative",
            "about -10",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            ". A differential amplifier has a differential gain of 20,000 . CMRR=80 dB. The common mode gain is given by",
            "2",
            "1",
            "1/2",
            "0",
            1,

        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "The approximate input impedance of the OPAMP circuit which has Ri=10k,Rf=100k,RL=10k",
            "∞",
            "120k",
            "110k",
            "10k",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "An OPAMP has a slew rate of 5 V/µ S .The largest sine wave O/P voltage possible at a frequency of 1MHZ is",
            ". 10 volts",
            "5 volts",
            "5/ volts",
            "5/2 volts",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "A change in the value of the emitter resistance Re in a differential amplifier",
            "affects the difference mode gain Ad",
            "affects the difference mode gain Ad",
            "affects both Ad and Ac",
            "does not effect either Ad and Ac",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            ". A differential amplifier is invariably used in the i/p stage of all OP-AMPs.This is dome basically to provide the OP-AMPs with a very high",
            "CMRR",
            "bandwidth",
            "slew rate",
            "open-loop gain",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "The effective channel length of a MOSFET in a saturation decreases with increase in",
            "gate voltage",
            "drain voltage",
            "source voltage",
            "body voltage",
            2
        )
        questionsList.add(que10)

        val que11 = Question(
            11,
            "Which of the following is not associated with a p-n junction",
            "junction capacitance",
            "charge storage capacitance",
            "depletion capacitance",
            "channel length modulation",
            4
        )
        questionsList.add(que11)

        val que12 = Question(
            12,
            "In a p-n junction diode under reverse bias , the magnitude of electric field is maximum at",
            "the edge of the depletion region on the p-side",
            "the edge of the depletion region on the n-side",
            "the p-n junction",
            " the center of the depletion region on the n-side",
            3
        )
        questionsList.add(que12)

        val que13 = Question(
            13,
            "An n- channel JFET has IDSS=2mA,and Vp=-4v.Its transconductance gm=in mA/V)for an applied gate to source voltage VGS=-2v is",
            "0.25",
            "0.5",
            "0.75",
            "1",
            2
        )
        questionsList.add(que13)

        val que14 = Question(
            14,
            "In a common emitter, unbypassed resister provides",
            "voltage shunt feedback",
            "current series feedback",
            "negative voltage feedback",
            "positive current feedback",
            3
        )
        questionsList.add(que14)

        val que15 = Question(
            15,
            "A constant current signal across a parallel RLC circuits gives an o/p of 1.4v at the signal frequency of 3.89KHZ and 4.1KHZ .At the frequency of 4KHZ,the o/p voltage will be",
            "1v",
            "2v",
            "1.4v",
            "2.8v",
            2
        )
        questionsList.add(que15)

        val que16 = Question(
            16,
            "Class AB operation is often used in power large signal) amplifiers in order to",
            "get maximum efficiency",
            "remove even harmonics",
            "overcome a crossover distortion",
            "reducing collector dissipation",
            3
        )
        questionsList.add(que16)

        val que17 = Question(
            17,
            "The bandwidth of an RF tuned amplifier is dependent on",
            "Q –factor of the tuned o/p circuit",
            "Q –factor of the tuned i/p circuit",
            " Quiescent operating point",
            "Q-factor of the o/p and i/p circuits as well as quiescent operating point",
            1
        )
        questionsList.add(que17)

        val que18 = Question(
            18,
            "If =0.98 ,Ico=6µA and Iβ=100µA for a transistor,then the value of Ic will be",
            "2.3mA",
            "3.2mA",
            "4.6 mA",
            "5.2mA",
            4
        )
        questionsList.add(que18)

        val que19 = Question(
            19,
            "The MOSFET switch in its on-state may be considered equivalent to",
            "resistor",
            "inductorz",
            "capacitor",
            "battery",
            3
        )
        questionsList.add(que19)

        val que20 = Question(
            20,
            "Most of the linear ICs are based on the twotransistor differential amplifier because of its\n",
            " input voltage dependent linear transfer characteristic",
            "high voltage gain",
            " high input resistance",
            "high CMRR",
            4
        )
        questionsList.add(que20)




        return questionsList
    }
}