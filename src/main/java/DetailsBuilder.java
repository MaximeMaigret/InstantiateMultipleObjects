/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author maxime.maigret
 */
public class DetailsBuilder {

    
    public static DetailsBuildings copyAndConvert(Details details) {
        return new DetailsBuildings()
                .setId(details.getId())
                .setName(details.getName())
                .setSize(details.getSize());
    }

    private static Details build(DetailsBuildings details) {
        Details newDetails = new Details();
        newDetails.setId(details.getId());
        newDetails.setName(details.getName());
        newDetails.setSize(details.getSize());
        return newDetails;
    }

    protected static class DetailsBuildings {

        private int id;
        private String name;
        private long size;

        private int getId() {
            return id;
        }

        private String getName() {
            return name;
        }

        private long getSize() {
            return size;
        }

        DetailsBuildings setId(int id) {
            this.id = id;
            return this;
        }

        DetailsBuildings setName(String name) {
            this.name = name;
            return this;
        }

        DetailsBuildings setSize(long size) {
            this.size = size;
            return this;
        }

        public Details build() {
            return DetailsBuilder.build(this);
        }

    }

}
