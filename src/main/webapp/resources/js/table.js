$(document).ready(function() {
        $('#show-table').jtable({
                title : 'Contato List',
                actions : {
                        listAction : '/contatos/api/all',
                        createAction : '/contatos/api/create',
                        updateAction : '/contatos/api/editar',
                        deleteAction : '/contatos/api/delete'
                },
                fields : {
                        id : {
                                title : 'Contato Id',
                                width : '30%',
                                key : true,
                                list : true,
                                edit : false,
                                create : false
                        },
                        nome : {
                                title : 'Nome',
                                width : '30%',
                                edit : true
                        },
                        telefone : {
                                title : 'Telefone',
                                width : '20%',
                                edit : true
                        },
                        email : {
                            title : 'Email',
                            width : '30%',
                            edit : true
                        },
                        endereco : {
                            title : 'Endereco',
                            width : '20%',
                            edit : true
                        }
                }
        });
        $('#show-table').jtable('load');
});