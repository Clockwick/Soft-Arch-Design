package edu.parinya.softarchdesign.structural;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : members) {
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
