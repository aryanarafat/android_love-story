package com.twisthour.love_story.Beans;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.twisthour.love_story.ContentActivity;
import com.twisthour.love_story.Db.Helper;
import com.twisthour.love_story.R;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.VH> {
    private List<HistoryModel> historyModelList;
    private Context context;
    int white_color = Color.parseColor("#FFFFFF");
    int black_color = Color.parseColor("#FF000000");
    int darkColorPrimary = Color.parseColor("#424242");




    private String colorPrimaryDark = "";
    private String ColorText = "";

    public HistoryAdapter(List<HistoryModel> historyModelList) {
        this.historyModelList = historyModelList;

    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_history_item,parent,false);





        return  new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, @SuppressLint("RecyclerView") int position) {



        holder.title.setText(historyModelList.get(position).getTitle());
        holder.category.setText(historyModelList.get(position).getCategory());
        holder.time.setText(new Date(historyModelList.get(position).getTime()).toLocaleString());

        if (historyModelList.get(position).getType()==1){
            holder.icon.setImageResource(R.drawable.ic_favourite_select);
        }else {
            holder.icon.setImageResource(R.drawable.bottom_nav_menu_history);
        }

        holder.del.setImageResource(R.drawable.delete_white);

        holder.title.setTextColor(white_color);
        holder.category.setTextColor(white_color);
        holder.time.setTextColor(white_color);




        SharedPreferences data = holder.itemView.getContext().getSharedPreferences("data", 0);
        //  if (!HistoryAdapter.this.data.getString("theme", "").equals("night_theme")) {


        if (data.getString("theme", "").equals("night_theme")) {


            {

                holder.del.setImageResource(R.drawable.delete_white);
                holder.item.setBackgroundResource(R.drawable.dark_item_background);

                holder.title.setTextColor(white_color);
                holder.category.setTextColor(white_color);
                holder.time.setTextColor(white_color);

            }
        } else {

            holder.del.setImageResource(R.drawable.delete_grey);
            holder.item.setBackgroundResource(R.drawable.white_item_background);
            holder.title.setTextColor(black_color);
            holder.category.setTextColor(black_color);
            holder.time.setTextColor(black_color);

        }


         //   {
            //    imageView.setImageResource(R.drawable.ic_chevron_right_grey);
            //    textView.setTextColor(Color.parseColor(HimuViewActivity.this.ColorText));
          //  }
      //  } else {
          //  imageView.setImageResource(R.drawable.ic_chevron_right_white);
       //     textView.setTextColor(Color.parseColor(HimuViewActivity.this.ColorText));
     //   }






        holder.del.setOnClickListener(v->{


            new AlertDialog.Builder(context)
                    .setTitle("Delete history")
                    .setMessage("Are you sure you want to delete this history?")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                            if (historyModelList.size()>0) {
                                new Helper(context).delete(historyModelList.get(position).getId(), new Helper.onDelete() {
                                    @Override
                                    public void delete() {
                                        historyModelList.remove(position);
                                       notifyDataSetChanged();
                                    }
                                });

                            }

                        }
                    })

                    .setNegativeButton(android.R.string.no, null)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        });

        holder.item.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                new AlertDialog.Builder(context)
                        .setTitle("Delete history")
                        .setMessage("Are you sure you want to delete this history?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                if (historyModelList.size()>0) {
                                    new Helper(context).delete(historyModelList.get(position).getId(), new Helper.onDelete() {
                                        @Override
                                        public void delete() {
                                            historyModelList.remove(position);
                                            notifyDataSetChanged();

                                        }
                                    });

                                }

                            }
                        })

                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();


                return true;
            }
        });


        holder.item.setOnClickListener(v->{

            Intent intent = new Intent(context, ContentActivity.class);
            intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.NAME,historyModelList.get(position).getTitle());
            intent.putExtra("content",historyModelList.get(position).getContent());
            intent.putExtra("category",historyModelList.get(position).getCategory());
            context.startActivity(intent);

        });


    }



    @Override
    public int getItemCount() {
        return historyModelList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView title,category,time;
        LinearLayout item;
        ImageView del;
        ImageView icon;
        public VH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.adapter_title);
            category = itemView.findViewById(R.id.category);

            time = itemView.findViewById(R.id.time);
            item = itemView.findViewById(R.id.item);
            del = itemView.findViewById(R.id.del);
            icon = itemView.findViewById(R.id.icon);





        }



    }


    public List<Integer> getColor() {

        List <Integer> colorcode = new ArrayList<>();

        colorcode.add(R.color.arsenic);
        colorcode.add(R.color.blue);
        colorcode.add(R.color.black);

        return colorcode;

    }


}
