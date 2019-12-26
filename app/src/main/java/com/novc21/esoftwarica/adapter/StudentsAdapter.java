package com.novc21.esoftwarica.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.novc21.esoftwarica.R;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>{

    Context context;
    List<Students> studentsList;

    public StudentsAdapter(Context context, List<Students> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_students,parent,false);
        return new StudentsViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        Students students = studentsList.get(position);
        holder.etName.setText(students.getName());
        holder.etAge.setText(students.getAge()+"");
        holder.etAddress.setText(students.getAddress());


    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder{
        RadioButton rbMale, rbFemale, rbOther;
        EditText etName, etAge, etAddress;
        public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);
            etName = itemView.findViewById(R.id.etName);
            etAge = itemView.findViewById(R.id.etAge);
            etAddress = itemView.findViewById(R.id.etAddress);
            rbMale = itemView.findViewById(R.id.rbMale);
            rbFemale = itemView.findViewById(R.id.rbFemale);
            rbOther = itemView.findViewById(R.id.rbOther);
        }
    }

}
