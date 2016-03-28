$(document).ready(function() {
    $('#contatoTable').dataTable( {
        "processing": true,
        "bServerSide": true,
        "sAjaxSource":  "/dtable/all",

"columns" : [
                             
                   {
                        "nome" : "Nome:",
                        "class" : "center"
                  },
            {
                "class":          'details-control',
                "orderable":      false,
                "data":           null,
                "defaultContent": 'default value of column'
            }       
          ]




    } )
} );
//$(document).ready(function(){
//	$('#contatoTable').dataTable( {
//	        "bRetrieve": true,
//	        "bDestroy":true,
//	        "bPaginate": true,
//	        "bProcessing": true,
//	        "bServerSide": true,
//	        "sAjaxSource": '/dtable/all',
//	        "fnServerData": function ( sSource, aoData, fnCallback ) {
//	            $.ajax( {
//	                dataType: 'json',
//	                contentType: "application/json;charset=UTF-8",
//	                type: 'POST',
//	                url: sSource,
//	                data: stringify_aoData(aoData),
//	                success: fnCallback,
//	            } );
//	        }
//	} );
//});