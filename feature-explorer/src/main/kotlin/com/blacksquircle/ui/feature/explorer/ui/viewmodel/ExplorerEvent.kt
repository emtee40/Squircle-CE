package com.blacksquircle.ui.feature.explorer.ui.viewmodel

import com.blacksquircle.ui.filesystem.base.model.FileModel

sealed class ExplorerEvent {

    data class ListFiles(val parent: FileModel? = null) : ExplorerEvent()
    data class SearchFiles(val query: String) : ExplorerEvent()
    data class SelectFiles(val selection: List<FileModel>) : ExplorerEvent()

    data class Refresh(val parent: FileModel? = null) : ExplorerEvent()
    data class OpenFileAs(val fileModel: FileModel? = null) : ExplorerEvent()
    data class OpenFile(val fileModel: FileModel) : ExplorerEvent()

    object Cut : ExplorerEvent()
    object Copy : ExplorerEvent()
    object Paste : ExplorerEvent()
    object Delete : ExplorerEvent()
    object SelectAll : ExplorerEvent()
    object Rename : ExplorerEvent()
    object Properties : ExplorerEvent()
    object CopyPath : ExplorerEvent()
    object Zip : ExplorerEvent()

    object ShowHidden : ExplorerEvent()
    object HideHidden : ExplorerEvent()
    object SortByName : ExplorerEvent()
    object SortBySize : ExplorerEvent()
    object SortByDate : ExplorerEvent()
}