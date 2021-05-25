package com.study.st_word.biz;

import com.study.st_word.bo.ProgressBo;
import com.study.st_word.bo.WordBo;

/**
 * @author songdechuan
 * @date 2021-04-21 18:48
 */
public interface IBizDataService {

    Object videoList();


    Object wordList();

    Object editPro(ProgressBo progressBo);

    Object unknow(WordBo wordBo);

    Object know(WordBo wordBo);

    Object getProgress(WordBo wordBo);

    Object bookList();

}
