package com.chrisgaddes.compoundmovements.paths.books;

import android.support.v4.app.Fragment;

import com.chrisgaddes.compoundmovements.application.RealmManager;


/**
 * Created by Zhuinden on 2016.08.16..
 */
public class BooksScopeListener extends Fragment {
    BooksPresenter booksPresenter;

    public BooksScopeListener() {
        setRetainInstance(true);
        RealmManager.incrementCount();
        booksPresenter = new BooksPresenter();
    }

    @Override
    public void onDestroy() {
        RealmManager.decrementCount();
        super.onDestroy();
    }

    public BooksPresenter getPresenter() {
        return booksPresenter;
    }
}
