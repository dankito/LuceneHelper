package net.dankito.utils.lucene


class BigDecimalFieldTest : BigDecimalFieldTestBase() {

    override fun createInstancesCreator(): ILuceneTestInstancesCreator<*, *, *, *> {
        return LuceneTestInstancesCreator()
    }

}