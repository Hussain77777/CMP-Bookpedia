package com.plcoding.bookpedia

import androidx.compose.runtime.*

import org.jetbrains.compose.ui.tooling.preview.Preview

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.compose_multiplatform
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewModel

@Composable
@Preview
fun App() {
BookListScreenRoot(
    viewModel = remember { BookListViewModel() },
    onBookClick = {

    }
)
}