package net.dankito.utils.lucene


class TextFieldTest : TextFieldTestBase() {

    override fun createInstancesCreator(): ILuceneTestInstancesCreator<*, *, *, *> {
        return LuceneTestInstancesCreator()
    }

}