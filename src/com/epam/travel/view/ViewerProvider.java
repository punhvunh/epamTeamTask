package com.epam.travel.view;

import com.epam.travel.view.impl.MainViewerImpl;

public class ViewerProvider {
    private static final ViewerProvider instance = new ViewerProvider();

    private MainViewer mainViewer = new MainViewerImpl();

    private ViewerProvider(){}

    public static ViewerProvider getInstance() {
        return instance;
    }


    public MainViewer getMainViewer() {
        return mainViewer;
    }
}
