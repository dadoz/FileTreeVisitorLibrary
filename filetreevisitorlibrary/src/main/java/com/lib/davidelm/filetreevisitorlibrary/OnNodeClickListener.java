package com.lib.davidelm.filetreevisitorlibrary;


import android.view.View;

import com.lib.davidelm.filetreevisitorlibrary.models.TreeNode;


public interface OnNodeClickListener {
    void onFolderNodeCLick(View v, int position, TreeNode node);
    void onFileNodeCLick(View v, int position, TreeNode node);
}
