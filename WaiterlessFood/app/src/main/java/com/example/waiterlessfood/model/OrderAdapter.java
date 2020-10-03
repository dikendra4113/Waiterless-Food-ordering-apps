package com.example.waiterlessfood.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waiterlessfood.OrderViewActivity;
import com.example.waiterlessfood.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class OrderAdapter extends FirebaseRecyclerAdapter<OrderModel,OrderAdapter.myViewHolder> {

    private final OrderViewActivity orderViewActivity;

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param orderViewActivity
     * @param options
     */
    public OrderAdapter(OrderViewActivity orderViewActivity, @NonNull FirebaseRecyclerOptions<OrderModel> options) {
        super(options);
        this.orderViewActivity = orderViewActivity;
    }

    @Override
    protected void onBindViewHolder(@NonNull OrderAdapter.myViewHolder holder, int position, @NonNull OrderModel model) {

        holder.order_seat.setText("Seat No. "+model.getTable());
        holder.order_price.setText("RS. "+model.getPrice());
        holder.order_des.setText("Des: "+model.getDescription());
        holder.order_pname.setText("Name "+model.getPname());
        holder.order_catagary.setText(model.getCatagary());
        holder.order_date.setText("Date "+model.getDate());
        holder.order_quantity.setText("Qantity: "+model.getQuantity());
        holder.order_payment.setText("Payment Status:"+model.getPaid());
    }

    @NonNull
    @Override
    public OrderAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_view,parent,false);
        return new OrderAdapter.myViewHolder(view);
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView order_pname,order_catagary,order_des,order_price,order_seat,order_date,order_quantity,order_payment;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            order_catagary = (TextView)itemView.findViewById(R.id.order_produdCatagory);
            order_pname = (TextView)itemView.findViewById(R.id.order_productName);
            order_des = (TextView)itemView.findViewById(R.id.order_description);
            order_price = (TextView)itemView.findViewById(R.id.order_productPrice);
            order_seat = (TextView)itemView.findViewById(R.id.order_seat);
            order_date = (TextView)itemView.findViewById(R.id.order_date);
            order_quantity = (TextView)itemView.findViewById(R.id.order_quantity);
            order_payment = (TextView)itemView.findViewById(R.id.order_payment);

        }
    }
}
