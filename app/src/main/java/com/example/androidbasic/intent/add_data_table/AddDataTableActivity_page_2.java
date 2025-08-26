package com.example.androidbasic.intent.add_data_table;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class AddDataTableActivity_page_2 extends fullscreen {

    private TableLayout tableHeader;
    private TableLayout tableData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_add_data_table_page_2);

        tableHeader = findViewById(R.id.tableHeader);
        tableData = findViewById(R.id.tableData);

        // Nhận dữ liệu ArrayList<String> từ Page_1
        ArrayList<String> data = getIntent().getStringArrayListExtra("data");

        // Tạo header
        TableRow header = new TableRow(this);
        header.addView(makeTextView("Name", true));
        header.addView(makeTextView("Age", true));
        header.addView(makeTextView("School", true));
        tableHeader.addView(header);

        // Thêm dữ liệu
        if (data != null) {
            for (String item : data) {
                // item = "Nguyen Van A - 19 - CD FPT POLITECHNIC"
                String[] parts = item.split(" - ");
                TableRow row = new TableRow(this);
                for (String part : parts) {
                    row.addView(makeTextView(part, false));
                }
                tableData.addView(row);
            }
        }
    }

    private TextView makeTextView(String text, boolean isHeader) {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setPadding(20, 15, 20, 15);
        tv.setTextSize(isHeader ? 18 : 16);
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(isHeader ? 0xFF000000 : 0xFF444444);

        if (isHeader) {
            tv.setBackgroundColor(0xFFDDDDDD);
        } else {
            tv.setBackgroundResource(R.drawable.cell_border);
        }

        // set width max = 200dp, wrap_content nhưng không vượt quá
        int maxWidthPx = (int) (200 * getResources().getDisplayMetrics().density); // 200dp → px
        tv.setMaxWidth(maxWidthPx);
        tv.setSingleLine(false);  // cho phép xuống dòng nếu chữ quá dài
        tv.setEllipsize(null);    // không cắt chữ

        // wrap_content để co vừa chữ
        TableRow.LayoutParams params = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT
        );
        tv.setLayoutParams(params);

        return tv;
    }




}