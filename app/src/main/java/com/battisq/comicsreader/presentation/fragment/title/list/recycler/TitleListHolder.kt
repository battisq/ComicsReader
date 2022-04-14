package com.battisq.comicsreader.presentation.fragment.title.list.recycler

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.battisq.comicsreader.databinding.ViewHolderTitleItemBinding

class TitleListHolder(
    private val binding: ViewHolderTitleItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun setTitleName(titleName: String) {
        binding.titleName.text = titleName
    }

    fun setPreview(previewUrl: String?) {
        binding.titlePreview.load(previewUrl)
    }
}