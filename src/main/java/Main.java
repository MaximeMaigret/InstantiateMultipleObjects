/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author maxime.maigret
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Details details = new Details();
        details.setId(1);
        details.setName("Bernard");
        details.setSize(50);

        System.out.println(details.toString());
        Details otherDetails = DetailsBuilder.copyAndConvert(details)
                .setId(5)
                .setName("toto")
                .build();

        System.out.println(otherDetails.toString());

        Details otherDetailsAgain = DetailsBuilder.copyAndConvert(otherDetails)
                .setName("Maxime")
                .build();

        System.out.println(otherDetailsAgain.toString());

    }

}
