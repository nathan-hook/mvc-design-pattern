package name.nch.model.payment;

import java.util.Date;

public class Paycheck {

    private Date startDate;
    private Date endDate;

    public Paycheck(Date startDate, Date endDate) {

        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
