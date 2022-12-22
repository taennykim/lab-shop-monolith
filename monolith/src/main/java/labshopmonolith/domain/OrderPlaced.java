package labshopmonolith.domain;

import labshopmonolith.domain.*;
import labshopmonolith.infra.AbstractEvent;
import java.util.*;
import lombok.*;


//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
//>>> DDD / Domain Event