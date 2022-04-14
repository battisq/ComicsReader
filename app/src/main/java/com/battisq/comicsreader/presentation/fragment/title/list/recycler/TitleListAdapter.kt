package com.battisq.comicsreader.presentation.fragment.title.list.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.battisq.comicsreader.R
import com.battisq.comicsreader.databinding.ViewHolderTitleItemBinding
import com.battisq.comicsreader.domain.model.title.Title

class TitleListAdapter(private val titleList: List<Title>): RecyclerView.Adapter<TitleListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleListHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_title_item, parent)

        val binding = ViewHolderTitleItemBinding.bind(view)

        return TitleListHolder(binding)
    }

    override fun onBindViewHolder(holder: TitleListHolder, position: Int) {
        super.bindViewHolder(holder, position)

        val title = titleList[position]

        with(title) {
            with(holder) {
                setPreview(previewUrl)
                setTitleName(name)
            }
        }
    }

    override fun getItemCount(): Int = titleList.size
}